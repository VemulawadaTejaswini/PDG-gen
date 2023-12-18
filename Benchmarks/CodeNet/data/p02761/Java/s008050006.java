import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        int x[] = new int[N];
        boolean FLG = false;
        for(int i=0;i<M;i++){
            int s = sc.nextInt();
            int c = sc.nextInt();
            
            if(N < s)FLG = true;
            if(s == 1 && c == 0)FLG = true;
            if(x[s-1] != 0 && x[s-1] != c)FLG = true;

            if(FLG) break;
            x[s-1] = c;
        }
        if(FLG){
            System.out.println(-1);
        }else{
            if(x[0] == 0)x[0] = 1;
            for(int i=0; i<x.length; i++){
                System.out.print(x[i]);
            }
            System.out.println();
        }
        sc.close();
    }
}