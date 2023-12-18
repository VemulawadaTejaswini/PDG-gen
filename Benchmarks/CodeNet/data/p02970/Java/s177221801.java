import java.util.*;
public class Main{
public static void main(String[] args){       Scanner s=new Scanner(System.in);                     int N=s.nextInt();                            int D=s.nextInt();                    
int check=N/D;
double answer=Math.floor(check);              int ans=(int)answer;                          if(ans%2==0){                                 System.out.print(ans/2);                      }
else{
System.out.print(ans/2+1);
}


}
}