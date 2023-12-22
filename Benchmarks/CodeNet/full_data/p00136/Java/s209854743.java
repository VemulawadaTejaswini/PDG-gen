import java.util.Scanner;
	class Main{
//PCK2006 0136
		public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int kaisu;
	double date;
	int count[]=new int[6];
	
	kaisu=sc.nextInt();
	for(int i=0;i<kaisu;i++){
		date=sc.nextDouble();
		int ff;
	Math.floor(date);
	if(date<165){
		count[0]++;
	}else if(date<170){
		count[1]++;
	}else if(date<175){
		count[2]++;
	}else if(date<180){
		count[3]++;
	}else if(date<185){
		count[4]++;
	}else if(date>=185){
		count[5]++;
	}
	}
	String moji;
	String moji1 = "";
	moji="*";
for(int i=0;i<6;i++){
	int su;
	su=i+1;
	for(int t=0;t!=count[i];t++){
	moji1=moji1+"*";
	}

	System.out.println(su+":"+moji1);
	moji1="";
}

	

	
	}
	}