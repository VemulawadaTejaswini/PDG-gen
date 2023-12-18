import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data= sc.nextInt();

		int fmflag=0;
		int fyflag=0;
		int lmflag=0;
		int lyflag=0;
		if((data%100)<13 && (data%100)>0 ) {
			lmflag=1;
			lyflag=1;
		}else {
			lyflag=1;
		}
		if(data/100<13&&(data/100)>0){
			fmflag=1;
			fyflag=1;
		}else {
			fyflag=1;
		}
	if(fmflag==1 && fyflag==1 && lyflag==1 && lmflag==1){
      System.out.println("AMBIGUOUS");
    }else if(fyflag==1 && lmflag==1 ) {
			System.out.println("YYMM");
		}else if(fmflag==1 && lyflag==1) {
			System.out.println("MMYY");
		}else if(fmflag==0 && lmflag==0) {
			System.out.println("NA");
		}

	}
}


