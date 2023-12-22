import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int kazu = n.nextInt();
		int data[]=new int[kazu];
		for(int i=0;i<kazu;i++){
			data[i]=n.nextInt();
		}
		Arrays.sort(data);
		for(int i=kazu-1;i>0;i--){
			System.out.print(data[i]+" ");
		}
		System.out.println(data[0]);
	}
}