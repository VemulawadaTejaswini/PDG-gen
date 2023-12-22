import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int[] l=new int[6];
            for(int i=0,s;i<6;l[i++]=sc.nextInt());
            if(l[0]==0) {
                break;
            }
            int x=1;
            int y=1;
            int z=1;
            int count=0;
             do{
                x=l[0]*x%l[1];
                y=l[2]*y%l[3];
                z=l[4]*z%l[5];
                count++;
            }while(x!=1||y!=1||z!=1);
            System.out.println(count);
        }
    }
}

