import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	while(n!=0){

	    String line = sc.next();
	    String line2 = sc.next();
	    if(line.length()<80 || line2.length()<80){
		int[] one = new int[80];
		for(int i=0; i<line.length(); i++){
		    one[80-i-1] = Integer.parseInt(line.substring(line.length()-1-i,line.length()-i));
		}
		int[] two = new int[80];
		for(int i=0; i<line2.length(); i++){
		    two[80-i-1] = Integer.parseInt(line2.substring(line2.length()-1-i,line2.length()-i));
		}
		
		int[] ans = new int[80];
		for(int i=0; i<80; i++){
		    ans[80-i-1] += one[80-i-1]+two[80-i-1];
		    if(ans[80-i-1]>=10 && 80-i-2>=0){
			int tmp = ans[80-i-1];
			ans[80-i-1] = tmp%10;
			ans[80-i-2] = (tmp-tmp%10)/10;
		    }
		}
		//System.out.println(Arrays.toString(ans));
		if(ans[0]>=10){
		    System.out.println("overflow");
		}else{
		    int i=0;
		    while(ans[i]==0){
			i++;
		    }
		    for(int j=i; j<80; j++){
			System.out.print(ans[j]);
		    }
		    System.out.println();
		}
	    }else{
		System.out.println("overflow");
	    }
	    n--;
	}
    }
}