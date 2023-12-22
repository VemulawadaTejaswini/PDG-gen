import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] height = new int[20];
	int first=15,second=15,third=15;
	height[15]=0;
	for(int i=0;i<10;i++){
		height[i]=sc.nextInt();
		if(height[first]<height[i]){
			third=second;
			second=first;
			first=i;
		}else if(height[second]<height[i]){
			third=second;
			second=i;
		}else if(height[third]<height[i]) third=i; 
	}
	System.out.println(height[first]);
	System.out.println(height[second]);
	System.out.println(height[third]);
    }
}

