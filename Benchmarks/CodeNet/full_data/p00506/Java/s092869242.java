import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    int[] num;
    int i;

    void run(){
	while(sc.hasNext()){
	    num = new int[sc.nextInt()];
	    for(i=0; i<num.length; i++)
		num[i] = sc.nextInt();
	    Arrays.sort(num);

	    i=1;
	    while(i<=num[0]){
		if(num[0]%i==0 && num[1]%i==0)
		    if(num.length==2 || (num.length==3 && num[2]%i==0))
			System.out.println(i);
		i++;
	    }
	}
    }
}