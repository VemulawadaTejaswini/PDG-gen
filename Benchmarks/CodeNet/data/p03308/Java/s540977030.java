import java.util.Scanner;

  public class Main{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     //int n = sc.nextInt();
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     int d = sc.nextInt();
     // int a = 1;
     // int b = 2;
     // int c = 3;
     // int d = 4;
     // int answer = 0;

     if((a<c)&&(c<b)&&(b<d)){
       answer = b-c;
     }else if(b<c){
       answer = 0;
     }else if((c<a)&&(a<d)&&(d<b)){
       answer = d-a;
     }else{
       answer = 0;
     }
     System.out.println(answer);
  }

}