import java.io.IOException;
import java.util.Scanner;

class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] Args) throws IOException{
        final int n = Integer.parseInt(sc.next());
        final dice d[] = new dice[n];
        for(int i = 0; i<n; i++){
            d[i] = new dice();
            for(int j = 0; j<6; j++)
                d[i].face[j] = Integer.parseInt(sc.next());
            for(int j = 0; j<i; j++){
                if(d[i].isSame(d[j])){
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}

class dice{
    public int face[] = new int[6];
    private static final String dir = "EEENWWWSEEENWWWSEEENWWWS";
    public void rotate(char dir){
        int temp;
        switch(dir){
        case 'N':
            temp = face[0];
            face[0] = face[1];
            face[1] = face[5];
            face[5] = face[4];
            face[4] = temp;
            break;
        case 'E':
            temp = face[0];
            face[0] = face[3];
            face[3] = face[5];
            face[5] = face[2];
            face[2] = temp;
            break;
        case 'W':
            temp = face[0];
            face[0] = face[2];
            face[2] = face[5];
            face[5] = face[3];
            face[3] = temp;
            break;
        case 'S':
            temp = face[0];
            face[0] = face[4];
            face[4] = face[5];
            face[5] = face[1];
            face[1] = temp;
            break;
        }
    }
    public boolean equals(dice d){
        for(int i = 0; i<6; i++){
            if(face[i]!=d.face[i]) return false;
        }
        return true;
    }
    public boolean isSame(dice d){
        for(int i = 0; i<24; i++){
            if(this.equals(d)) return true;
            d.rotate(dir.charAt(i));
        }
        return false;
    }
};