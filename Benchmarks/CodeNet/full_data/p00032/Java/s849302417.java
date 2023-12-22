import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        long dia=0;
        long rec =0;
       scan.useDelimiter(",|\\r\\n");
        while(scan.hasNextLong()){
        	long a=scan.nextLong();
        	long b=scan.nextLong();
        	long c=scan.nextLong();
        	if((long)Math.pow(a, 2)+(long)Math.pow(b, 2)==(long)Math.pow(c, 2))rec++;
        	if(a==b)dia++;
        }
        System.out.println(rec);
        System.out.println(dia);

  }
  }