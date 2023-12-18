import java.util.*;
class Foo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [(sc.nextInt()+1)],count,pointer;
		for(int i=1 ; i<arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		for(int i=1 ; i<arr.length ; i++){
			count=0;
			pointer=arr[0];
			for(int j=1 ; j<arr.length ; j++){
				if(i==j){
					continue;
				}else{
					count+=Math.abs(pointer-arr[j]);
					pointer=arr[j];
				}
			}
			count+=Math.abs(pointer-0);
			System.out.println(count);
		}
	}
}