import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner scanner =new Scanner(System.in);
       long K=scanner.nextLong();
       long A=-1;
       long baisuu[] = new long[9];
        baisuu[0]=7;
        baisuu[1]=77;
        baisuu[2]=777;
        baisuu[3]=7777;
        baisuu[4]=77777;
        baisuu[5]=777777;
        baisuu[6]=7777777;
        baisuu[7]=77777777;
        baisuu[8]=777777777;
       for(int i=0;i<9;i++){
           if(baisuu[i]%K==0){
               A=i+1;
               break;
           }
       }
       System.out.println(A);
    }
}
