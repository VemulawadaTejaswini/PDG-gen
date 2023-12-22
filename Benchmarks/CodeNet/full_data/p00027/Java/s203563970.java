import java.util.Scanner;

public class Main {
    //彼女と上野動物園デートして一緒にシロフクロウを眺めたい（彼女いない）
    final static int[] MtoD={0,31,29,31,30,31,30,31,31,30,31,30,31};
    final static String[] DtoS={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int M,D,sumD;
        while(true){
            M=sc.nextInt();
            D=sc.nextInt();
            if(M==0&&D==0)break;
            sumD=D+2;
            for(int i=1;i<M;i++){
                sumD+=MtoD[i];
            }
            System.out.println(DtoS[sumD%7]);
        }
    }
}