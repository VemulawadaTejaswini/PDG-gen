import java.util.Scanner;

public class Main{
    public static void main(String[] args){
     try(Scanner sc= new Scanner(System.in)){
         while(true){
         int n =sc.nextInt();
         int r= sc.nextInt();
         if(n==0 && r==0){
             break;
         }
         int[] deck =new int[n];
         for(int i=0;i<deck.length;i++){
             deck[i]=i+1;
         }
         for(int i=0;i<r;i++){
             int p =sc.nextInt();
             int c= sc.nextInt();
             int[] save1=new int[n-c];
             int[] save2=new int[c];
             int a=0,b=0;
             for(int j=0;j<deck.length;j++){
               //  System.out.println("ok");
                 if(j<=n-p && j>n-p-c){
                   //  System.out.println("case1");
                     save2[a]=deck[j];
                     a++;
                 }else{
                   //  System.out.println("case2");
                     save1[b]=deck[j];
                     b++;
                 }
             }
             for(int j=0;j<deck.length;j++){
                 if(j<n-c){
                    deck[j]=save1[j];
                 }else{
                     deck[j]=save2[j-n+c];
                 }
             }
         //  System.out.println("roop");  
         } 
         System.out.printf("%d\n",deck[n-1]); 
        }
     }
      
    }
}
