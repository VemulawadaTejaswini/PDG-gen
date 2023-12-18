import java.util.Scanner;
public class Main {
	static int N;
	static int M;
	static int[] Pcity;
	static int[] Ycity;
	static int[][] PYcity;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		Pcity = new int[M];
		Ycity = new int[M];
		PYcity =  new int[M][2];
		for(int i=0;i<M;i++){
			Pcity[i] = sc.nextInt();
			Ycity[i] = sc.nextInt();
			PYcity[i][0] = Pcity[i];
			PYcity[i][1] = Ycity[i];
		}
		
		//先按行排序，再按列排序
		twoDimensionSort(PYcity);
		
		int Ynum = 0;
		for (int i=0;i<M;i++) {
			for(int r=0;r<M;r++){
				if(Pcity[i]==PYcity[r][0]){
					Ynum++;
					if(Ycity[i] == PYcity[r][1]){
						break;
					}
				}
			}
			System.out.println(mendPosition(Pcity[i])+mendPosition(Ynum));
			Ynum = 0;
        }
		
		sc.close();
	}
    
    private static String mendPosition(int num){
    	String numTemp = String.valueOf(num);
    	String strnum = "";
    	for(int i=0;i<6-numTemp.length();i++){
    		strnum += "0";
    	}
    	strnum = strnum+numTemp;
    	return strnum;
    } 
    
    public static void twoDimensionSort(int[][] PYcity) {
    	//行排序
		for(int i=0;i<PYcity.length-1;i++){
			for(int j=0;j<PYcity.length-1-i;j++){
				if(PYcity[j][0]>PYcity[j+1][0]) {
					swap(PYcity[j],PYcity[j+1]);
				}
				if(PYcity[j][0]==PYcity[j+1][0]) {
					if(PYcity[j][1]>PYcity[j+1][1]) {
						swap(PYcity[j],PYcity[j+1]);
					}
				}
			}
		}
	}
    
	public static void swap(int[] a,int[] b) {
		//交换一行
		int temp;
		for(int j=0;j<a.length;j++) {
			temp=a[j];
			a[j]=b[j];
			b[j]=temp;
		}			
	}
}