import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
	    String str1=reader.readLine();
	    String s1[]=str1.split(" ");

	    int n=Integer.parseInt(s1[0]);
	    int k=Integer.parseInt(s1[1]);
	    int l=Integer.parseInt(s1[2]);

	    int road[]=new int[k*2];
	    int rail[]=new int[l*2];

	    City c[]=new City[n];

	    StringBuilder sb=new StringBuilder();

	    for(int i=0;i<k;i++){
		String str2=reader.readLine();
		String s2[]=str2.split(" ");

		int one=Integer.parseInt(s2[0]);
		int two=Integer.parseInt(s2[1]);

		road[i]=one;
		road[i+1]=two;
	    }

	    for(int i=0;i<l;i++){
		String str2=reader.readLine();
		String s2[]=str2.split(" ");

		int one=Integer.parseInt(s2[0]);
		int two=Integer.parseInt(s2[1]);

		rail[i]=one;
		rail[i+1]=two;
	    }

	    for(int i=0;i<n;i++){
		c[i]=new City(i+1,road,rail);
		if(i==n-1)
		    sb.append(c[i].connect());
		else
		    sb.append(c[i].connect()+" ");  
	    }

	    System.out.println(sb);
	    
	    reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class City{
	int road=0;
	int rail=0;
	
	public City(int id,int road[],int rail[]){
	    for(int i=0;i<road.length;i++){
		if(id==road[i]){
		    this.road++; 
		}
		if(id==rail[i]){
		    this.rail++;
		}
	    }
	}
	int connect(){
	    if(road!=0){
		if(rail!=0){
		    return 2;
		}else{
		    return 1;
		}	
	    }else{
		if(rail!=0){
		    return 1;
		}else{
		    return 0;
		}
	    }
	}
    }

    static int gcd (int a, int b){
	return b>0?gcd(b,a%b):a;
    }
    static int lcm (int a, int b) {
	return a*b/gcd(a,b);
    }
}
