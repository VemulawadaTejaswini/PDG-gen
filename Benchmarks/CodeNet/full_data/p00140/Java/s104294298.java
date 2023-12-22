import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int [] list = {0,1,2,3,4,5,6,7,8,9,5,4,3,2,1};
		int n = sc.nextInt();
		for(int i=0; i < n; i++){
			int in = sc.nextInt();
			int out = sc.nextInt();
			int len = list.length;
			boolean skip;
			if(in > out && in <= 5)
				skip = true;
			else{
				skip = false;
			}
			for(int j=0; j < len; j++){
				if(list[j] == in){
					if(skip){
						skip = false;
					}
					else{
						int ind = j;
						while (list[ind % len] != out){
							System.out.print(list[ind % len]+ " ");
							ind++;
						}
						System.out.println(out);
						break;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}