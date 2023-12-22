import java.util.Scanner;

/*
 * テ、ツスツ陛・ツ崢榲ァツ崢ョテ」ツ?ョテヲツ篠「テァツエツ「テ」ツ?ァテヲツ敖・テ」ツ?淌」ツ?ョテ」ツ?凝」ツつ津・ツ?・テ」ツつ古」ツ?ヲテ」ツ?甘」ツ??
 * テ・ツ青古」ツ?佚・ツ崢榲ヲツ閉ーテァツ崢ョテ」ツ?ョテヲツ篠「テァツエツ「テ」ツ?ェテ」ツつ嘉」ツδォテ」ツδシテ」ツδ療」ツ?ァテ」ツ??ゥツ?陛」ツ??」ツ?ェテ」ツつ嘉」ツつづ」ツ??ヲツ猟「テ」ツ?ォテ」ツ?敕」ツ?ョテ」ツδォテ」ツδシテ」ツδ療」ツ?ッテ」ツつォテ」ツつヲテ」ツδウテ」ツδ暗ヲツクツ暗」ツ?ソ
 */
class E{
	int loop;
	int x;
	int y;
	
	E(int a,int b){
		loop=0;
		x=a;
		y=b;
	}
}
public class AOJ2217 {
	E map[][];
	int count;//,sx,sy;
	public static void main(String[] args) {
		new AOJ2217().run();
	}
	void run(){
		Scanner sc=new Scanner(System.in);
		
		while(true){
			int n=sc.nextInt();
			if(n==0) break;
			map=new E[n][n];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					int a=sc.nextInt();
					int b=sc.nextInt();
					map[j][i]= new E(a,b);
				}
			}
			int c=1;//loop number
			count=0;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(map[j][i].loop==0){
						//sx=j;sy=i;
						solve(j, i, c);
						c++;//loop number
					}
				}
			}
			System.out.println(count);
		}
	}
	
	void solve(int mx,int my,int c){
//		System.out.println(mx+" "+my+"  "+map[mx][my].x+" "+map[mx][my].y);
		
		if(0<map[mx][my].loop){//テ」ツ?ゥテ」ツ?」テ」ツ?凝」ツ?ョテヲツ篠「テァツエツ「テ」ツ?ァテヲツ敖・テ」ツ?淌」ツ?禿」ツ?ィテ」ツ?古」ツ?づ」ツつ?
			if(c==map[mx][my].loop){//テ、ツサツ甘・ツ崢榲」ツ?ョloopテ」ツ??」ツ?」テ」ツ?淌」ツつ嘉」ツ??ヲツ鳴ーテ」ツ?療」ツ??oopテ」ツつ津ィツヲツ凝」ツ?、テ」ツ?妥」ツ?淌」ツ?ョテ」ツ?ァテ・ツ「ツ療」ツつ?」ツ??
				count++;
			}
				return;//テ」ツ?凖」ツ?ァテ」ツ?ォティツヲツ凝」ツ?、テ」ツ?妥」ツ?殕oopテ」ツ??」ツ?」テ」ツ?淌」ツつ嘉」ツ?ェテ」ツ?ォテ」ツつづ」ツ?療」ツ?ェテ」ツ??
		}
		
		int a=map[mx][my].x;//テァツァツサテ・ツ仰陛・ツ?暗」ツつ津」ツ??」ツつ古」ツつ?
		int b=map[mx][my].y;
		
		map[mx][my].loop=c;//テ、ツサツ甘・ツ崢榲」ツ?ョloop numberテ」ツつ津」ツ??」ツつ古」ツつ?
		
		solve(a, b, c);
	}

}