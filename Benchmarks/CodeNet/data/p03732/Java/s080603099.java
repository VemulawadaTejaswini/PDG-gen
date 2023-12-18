import java.util.Scanner;

public class Main {

	public static int target;
	public static int size;
	
	public static void main(String args[]){
		
		Scanner cin = new Scanner(System.in);
		
		target = cin.nextInt();
		size = cin.nextInt();
		int list[][] = new int[target][2];
		int result=0;
		for(int i=0;i<target;i++){
			list[i][0] = cin.nextInt();
			list[i][1] = cin.nextInt();
		}
		
		if(list[0][0]>size){	
		}else{
			result = nap(0,0,0,list);
		}
		System.out.println(result);
	}
	
	static int nap(int count,int weight,int value,int array[][]){
		if(count==target-1){
				return array[count][1];
		}else{
			if(weight+array[count][0]<size){
				if(value+nap(count+1,weight+array[count][0],value+array[count][1],array)>value+nap(count+1,weight,value,array)){
					return nap(count+1,weight+array[count][0],value+array[count][1],array);
				}else{
					return nap(count+1,weight,value,array);
				}
			}else{
				return value;
			}
		}
	}
	
}
