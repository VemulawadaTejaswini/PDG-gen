import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		class qube{
			Scanner sc = new Scanner(System.in);
			int [] face = new int[6];
			Integer i,dump=0;
			String e;
			String es[];
			
			qube(){
				for(i=0;i<6;i++){
					face[i]=sc.nextInt();
				}
			}
			
			void swap(int a,int b){
				dump = this.face[a];
				this.face[a] = this.face[b];
				this.face[b] = dump;
				
			}
			void scn(){
				e =sc.next();
				es = e.split("");
			}
			void pt(){
				System.out.printf("%d\n", this.face[0]);
				System.exit(0);
			}
			
			void move(){
				scn();
				for(i=0;;i++){
					
					if(i.equals(this.es.length)){
						this.pt();
					}
					if(this.es[i].equals("E")){
						swap(0,2);
						swap(0,5);
						swap(0,3);
					}
					else if(this.es[i].equals("N")){
						swap(4,5);
						swap(4,1);
						swap(4,0);
					}
					else if(this.es[i].equals("S")){
						swap(1,5);
						swap(1,4);
						swap(1,0);
					}
					else{
						swap(3,5);
						swap(3,2);
						swap(3,1);
					}
				}
			}
			
		}
		
		qube q = new qube();
		q.move();
	}
}
