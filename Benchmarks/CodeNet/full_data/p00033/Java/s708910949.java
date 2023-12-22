import java.util.*;


class Main{

    int n;
    int[] t = new int[10];
    
    Main(){
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            n--;
            for(int i=0;i<10;i++){
                t[i]=sc.nextInt();
            }
            System.out.println(solve());
        }
    }

    String solve(){
        int L=0,R=0;
        for(int i=0;i<10;i++){
            if(L<t[i])L=t[i];
            else if(R<t[i])R=t[i];
            else return "NO";
        }
        return "YES";
    }
    

    public static void main(String[] args){
        new Main();
    }
}