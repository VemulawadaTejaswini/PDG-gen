
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		class qube{
			int [] face = new int[6], faces = new int[6];
			Integer i,dump=0;
			int nc=0;


			qube(){
				for(i=0;i<6;i++){
					face[i]=sc.nextInt();
				}
				for(i=0;i<6;i++){
					faces[i]=sc.nextInt();
				}
			}

			void swap(int a,int b){
				dump = this.faces[a];
				this.faces[a] = this.faces[b];
				this.faces[b] = dump;

			}
			/*void pt(){
				System.out.printf("%d\n", this.face[2]);
			}*/

			void move(String es){
				if(es.equals("E")){
					swap(0,2);
					swap(0,5);
					swap(0,3);
				}
				else if(es.equals("N")){
					if(nc == 4){
						this.move("E");
						this.move("E");
					}
					swap(4,5);
					swap(4,1);
					swap(4,0);
					nc++;
				}

			}

		}

		qube q = new qube();
		int i=0;
		while(true){
			if(q.face[1]==q.faces[1]){
				break;
			}
			q.move("N");
		}
		while(true){
			if(q.face[0]==q.faces[0]){
				break;
			}
			else if(i==4) break;
			q.move("E");
			i++;
		}
		if(Arrays.equals(q.face, q.faces)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}

	}

}
