import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				int toppingtype= sc.nextInt();
				int doughprice= sc.nextInt();
				int toppingprice= sc.nextInt();
				int doughcaroly= sc.nextInt();
				int toppingcaroly[] =new int[toppingtype];
				for(int i=0;i<toppingtype;i++){
					toppingcaroly[i]= sc.nextInt();
				}
				for(int i=0;i<toppingtype-1;i++){
					if(toppingcaroly[i]<toppingcaroly[i+1]){
						int s=toppingcaroly[i];
						toppingcaroly[i]=toppingcaroly[i+1];
						toppingcaroly[i+1]=s;
					}
				}
				int normalpizza=doughcaroly/doughprice;
				int sum=0;
				for(int i=0;i<toppingtype;i++){
					sum=sum+toppingcaroly[i];
					int bestpizza=(sum+doughcaroly)/(toppingprice*(i+1)+doughprice);
					if(normalpizza<bestpizza){
						normalpizza=bestpizza;
					}else if(normalpizza>=bestpizza){
						System.out.println(normalpizza);
					}		
				}
			}
		}