import java.util.*;
class Main{
	static Scanner sc;
	static int a,n,m,HPQ[][],nowX,nowY;
	public static void main(String[]args){
		sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		a=sc.nextInt();
		HPQ=new int[n][3];

		for(int i=0;i<n;i++){
			HPQ[i][0]=sc.nextInt();
			HPQ[i][1]=sc.nextInt();
			HPQ[i][2]=sc.nextInt();
		}
		sc.nextInt();
		
		List<ArrObj> arrList = new ArrayList<ArrObj>();
		for ( int i = 0 ; i < n ; i ++ ){
			arrList.add(new ArrObj(HPQ[i][0],HPQ[i][1],HPQ[i][2]));
		}
		Collections.sort(arrList, new Comparator<ArrObj>(){
			public int compare(ArrObj ao1,ArrObj ao2) {
			return ao1.getNum0() - ao2.getNum0();
			}
		});
		for(int i=0;i<n;i++){
			 HPQ[i][0]=arrList.get(i).getNum0();
			 HPQ[i][1]=arrList.get(i).getNum1();
			 HPQ[i][2]=arrList.get(i).getNum2();
		}

		nowX=a;
		nowY=0;
		for(int i=0;i<m;i++){
			if(nowY<HPQ[i][0]){
				nowY=HPQ[i][0];
			}
		}
		while(nowY>0){
			for(int i=nowY;i>=0;i--){
				if(nowY==HPQ[i][0] && nowX==HPQ[i][1]){
					nowX=HPQ[i][2];
				}else if(nowY==HPQ[i][0] && nowX==HPQ[i][2]){
					nowX=HPQ[i][1];
				}else if(nowY>HPQ[i][0]){
					break;
				}
			}
					nowY--;
		}
		System.out.println(nowX);
	}
}

class ArrObj{
	private int num0;
	private int num1;
	private int num2;
	public ArrObj(int num0,int num1,int num2){
		this.setNum0(num0);
		this.setNum1(num1);
		this.setNum2(num2);
	}
	public int getNum0() {
		return num0;
	}
	public void setNum0(int num0) {
		this.num0 = num0;
	}
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
}