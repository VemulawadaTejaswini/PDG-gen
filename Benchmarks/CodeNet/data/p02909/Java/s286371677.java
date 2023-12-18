import java.util.*;
public class Main{
    public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	String a=sc.next();
	String weather[]={"Sunny","Cloudy","Rainy"};
	int b=0;
	for(int i=0;i<weather.length;i++){
	    if(a.equals(weather[i])){
		b=(i+1)%3;
		System.out.println(weather[b]);
	    }
	}
    }
}
