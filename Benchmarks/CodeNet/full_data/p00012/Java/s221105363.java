import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float x[]=new float[3]; float y[]=new float[3];
        float xp,xy; 
        while(sc.hasNext()){
     for(int i=0;i<3;i++){
    	 x[i]=sc.nextFloat(); y[i]=sc.nextFloat();
     }
      xp=sc.nextFloat();xy=sc.nextFloat();
      Arrays.sort(x); Arrays.sort(y);
      if(xp>=x[0]&&xp<=x[2]&&xy>=y[0]&&xy<=y[2]){
    	  System.out.println("YES");
      }else System.out.println("NO");
      }
     }
    }