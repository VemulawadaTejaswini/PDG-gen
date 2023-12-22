import java.util.Scanner;
class Stac{
	int num;
	public Stac(String str) {
		num=Integer.parseInt(str);
	}
	public void Show() {
		System.out.println(num);
	}
}

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int i=0;
        String str="";
        Stac[] stac=new Stac[100];
        while(scan.hasNext()) {
        	str=scan.next();
        	if(str.equals("+")) {
        		stac[i-2].num=stac[i-2].num+stac[i-1].num;
        		i-=2;
        	}
        	else if(str.equals("-")) {
        		stac[i-2].num=stac[i-2].num-stac[i-1].num;
        		i-=2;
        	}
        	else if(str.equals("*")) {
        		stac[i-2].num=stac[i-2].num*stac[i-1].num;
        		i-=2;
        	}
        	else {
        		stac[i]=new Stac(str);
        	}
        	i++;
        }
        stac[0].Show();
	}
}
