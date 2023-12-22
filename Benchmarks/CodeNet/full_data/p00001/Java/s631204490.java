import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		int[] arg =new int[10];
		for(int i=0;i<10;i++){
			Scanner sc = new Scanner(System.in);
			arg[i] = Integer.parseInt(sc.next());
		}

		int[] store=new int[3];
		for(int i=0;i<10;i++){
			int s=arg[i];
			for(int j=0;j<3;j++){
				if(s>store[j]){
					if(j==0){
						store[j+2]=store[j+1];
						store[j+1]=store[j];
						store[j]=s;
						break;
					}else if(j==1){
						store[j+1]=store[j];
						store[j]=s;
						break;
					}else{
						store[j]=s;
					}
				}
			}
		}
		for(int i=0;i<store.length;i++){
			System.out.println(store[i]);
		}
	}

}