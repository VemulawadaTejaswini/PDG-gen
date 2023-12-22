import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner scanner =new Scanner(System.in);
       long K=scanner.nextLong();
       long A=-1,baisuu=0;
       long eleven[] = new long[10];
        eleven[0]=1;
        eleven[1]=11;
        eleven[2]=111;
        eleven[3]=1111;
        eleven[4]=11111;
        eleven[5]=111111;
        eleven[6]=1111111;
        eleven[7]=11111111;
        eleven[8]=111111111;
        eleven[9]=1111111111;
       for(int i=0;i<10;i++){
           if(i==0){
               baisuu=7;
           }else{
               baisuu = 7*(eleven[i-1]*10+1);
           }
           if(baisuu%K==0){
               A=i+1;
               break;
           }
       }
       System.out.println(A);
    }
}
