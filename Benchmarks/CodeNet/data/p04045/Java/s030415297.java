import java.util.*; 
public class Main {

  public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int k=sc.nextInt();
  int ans=n;
  String d[]=new String[k];
  for (int i=0;i<k;i++){
    d[i]=sc.next();
  }
  boolean end=false;
  boolean con=false;
  String a;
  while(!end){
    a=String.valueOf(ans);
    con=false;
    for(int j=0;j<k;j++){
     if(a.contains(d[j])){
       con=true;
     }
    }
    if(con){
      ans++;
    }else end=true;
    
    
  }
 

  System.out.println(ans);
  }
  
}