import java.util.Scanner;
import java.util.ArrayList;
class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> array = new ArrayList<Integer>();
    
   while(sc.hasNextInt()){
   array.add(sc.nextInt());
   }
   for(int i=0; i<array.size(); i++){
   sosu(array.get(i));
   
   
   
   }
   
    
   }
   public static void sosu(int a){
   int count=1;
   if(a==1){
   System.out.println("1");
   
   }else if(a==2){
   System.out.println("2");
   
   }else{
   for(int i=3; i<=a; i++){
   for(int j=2; j<i; j++){
   if(i%j==0){
   break;
   }else{
   count++;
   }
   }
   }
   System.out.println(count);
   
   
   }
   }
   }
    