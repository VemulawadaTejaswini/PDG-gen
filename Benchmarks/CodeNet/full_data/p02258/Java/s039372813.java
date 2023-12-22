import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	int i,j,max=Integer.MIN_VALUE;
	
	Scanner sca = new Scanner(System.in);
	i=sca.nextInt();
	int[] hai= new int[i];
	hai[0]=sca.nextInt();
	for(i=1;i<hai.length;i++){
	    hai[i]=sca.nextInt();
	    for(j=i-1;j>=0;j--){
		if((hai[i]-hai[j])>max){
		    max=hai[i]-hai[j];
		}
	    }
	}
	System.out.println(max);
    }
}

