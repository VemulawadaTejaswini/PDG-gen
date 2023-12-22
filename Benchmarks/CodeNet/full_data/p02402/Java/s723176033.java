import java.util.Scanner; 
 public class Main {
   public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
       
    int a = sc.nextInt();
    int b ;
    int max;
    int min;
    int i;
    long sum=0;
    int list[];
       list = new int[a];
       for(i=0;i<a;i++){
           b = sc.nextInt();
           list[i]=b;
       }
       min=list[0];
       max=list[0];
       for(i=0;i<a;i++){
           
           if(list[i]>max){
               max=list[i];
           }
           if(list[i]<min){
               min=list[i];
           }
           sum+=list[i];
   
       }
       System.out.println(min+" "+max+" "+sum);
   }
 }
