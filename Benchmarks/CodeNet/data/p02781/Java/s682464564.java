import java.util.*;
public class Main {
    public static Long com (Long x,Long y){
        if(x<=1) return 1;
        if(y==0 || y==x) return 1;
        if(y<0 || y>x) return 0;
        return com(x-1,y-1)+com(x-1,y);
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
        Long b = a-a; 
        int c = sc.nextInt();
        for(int i=0;i<100;i++){if(Math.pow(10,i)<=a && Math.pow(10,i+1)>a){b=a/Math.pow(10,i)*com(i-1,c-1)*Math.pow(9,c-1)+com(i-1,c)*Math.pow(9,c);}
                              }       
		System.out.println(b);
	}
}