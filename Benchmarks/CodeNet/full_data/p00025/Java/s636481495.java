import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	while(true){
		if(!cin.hasNext()){
			break;
		}
		int ht=0,br=0;
		int[] a=new int[4];
		for(int i=0;i<4;i++){
			a[i]=cin.nextInt();
		}
		int[] b=new int[4];
		for(int i=0;i<4;i++){
			b[i]=cin.nextInt();
		}
		for(int q=0;q<4;q++){
			if(b[q]==a[q]){
				ht=ht+1;
			}
			else{
				for(int n=0;n<4;n++){
					if(b[q]==a[n]){
						br=br+1;
					}
				}
			}
		}
		System.out.println(ht+" "+br);
	}
	
	}

}