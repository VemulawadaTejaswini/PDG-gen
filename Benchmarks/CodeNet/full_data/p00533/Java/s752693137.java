import java.util.Scanner;
import java.util.Arrays;
public class Main {
	static int j=0;
	static boolean conte=true;
	 static int[] field_make(String str){
		j=0;
		int[] field=new int[str.length()];
		Arrays.fill(field, -1);
		conte=true;
		 while(conte && j< str.length()){
			 if(str.indexOf('c',j) == -1){
				 conte=false; 
			 }else{
				 field[str.indexOf('c',j)]=0;
				 j=str.indexOf('c',j);
			 }
			 j++;
		 }
		 return field;
	}
	
	
	static void doit(){
		Scanner sc = new Scanner(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int[][] field=new int[H][W];
		String[] str=new String[H];
		for(int i=0;i<H;i++){
			str[i]=sc.next();
			field[i]=field_make(str[i]);
		}
		
	sc.close();
	for(int i=0;i<H;i++){
		 for(int k=0;k<W-1;k++){
			 if(field[i][k]!=-1 && field[i][k+1]!=0){
				 field[i][k+1]=field[i][k]+1;
			 }
		 }
		 for (int k=0;k<W-1;k++){
				System.out.printf("%d ", field[i][k]);
			}
				System.out.printf("%d\n",field[i][W-1]);
	}
		
	}
	
	
	public static void main(String[] args) {
		new Main();
		doit();
	}

}