import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
  	String[] str=s.split("");
  
    int c=0;
  for(int b=0;b<n-1;b++){
   if(str[b].equals(str[b+1])){
   c++;
   }
  }
  
    System.out.println(n-c);
    
}

}