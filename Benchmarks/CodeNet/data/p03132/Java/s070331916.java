import java.util.Scanner;

public class Main {
   int L=0;
   int[] ears;
   int[] earsNew;
   int[] earsWork;
   int startNum;
   int endNum;
   int leftNum;
   int rightNum;
   int startAnswer;
   int endAnswer;
   int leftAnswer;
   int rightAnswer;
   long  sum;
   long  result;
   long  workResult;

	public Answer() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Answer ans1= new Answer();
        ans1.count();
	}
    private void count() {
    	// Lとearsを読み込む
    	Scanner scanner = new Scanner(System.in);
        L= scanner.nextInt();
        ears =new int[L];
        earsNew =new int[L];
        earsWork =new int[L];
        sum = 0;
        for(int earnum=0; earnum<L;earnum++){
        	int inputEars=scanner.nextInt();
        	ears[earnum]=inputEars;
        	if (inputEars==0) {
        		earsNew[earnum]=0;
        	}
            // earsを同値な問題に修正する
        	// 0の時は0,正の奇数は1,正の偶数は2
        	else if (inputEars-inputEars/2*2==0) {
                earsNew[earnum]=2;
                sum=sum+2;
        	} else {
                earsNew[earnum]=1;
                sum=sum+1;
        	}
        }
        // ears修正処理の確認
        //System.out.println();
        //for(int earnum=0; earnum<L;earnum++){
        //    System.out.println(earsNew[earnum]);
        //}
        //System.out.println(sum);
        //System.out.println();
        // 探索
        result=sum;
        startAnswer=0;
        endAnswer=0;
        leftAnswer=0;
        rightAnswer=0;
        for(startNum=0; startNum<=L; startNum++) {
            for(endNum=startNum; endNum<=L; endNum++) {
                for(leftNum=0; leftNum<=startNum; leftNum++) {
                    for(rightNum=endNum; rightNum<=L; rightNum++) {
                        for(int workNum=0; workNum<leftNum; workNum++) {
                           earsWork[workNum]=0;
                        }
                        if(leftNum<startNum)for(int workNum=leftNum; workNum<startNum; workNum++) {
                            earsWork[workNum]=2;
                         }
                        for(int workNum=startNum; workNum<endNum; workNum++) {
                            earsWork[workNum]=1;
                         }
                        if(endNum<rightNum)for(int workNum=endNum; workNum<rightNum; workNum++) {
                            earsWork[workNum]=2;
                         }
                        for(int workNum=rightNum; workNum<L; workNum++) {
                            earsWork[workNum]=0;
                         }
                        workResult=0;
                        for(int workNum=0;workNum<L;workNum++) {
                        	workResult=workResult+Math.abs(earsWork[workNum]-earsNew[workNum]);
                        }
                        //System.out.print(" "+result+":");
                        //System.out.print(" "+startNum+"," + endNum + ",");
                        //System.out.print(" "+leftNum+"," + rightNum + ":");
                        //for(int workNum=0;workNum<L;workNum++) {
                        //    System.out.print(" " +earsWork[workNum]);
                        //}
                        //System.out.println(" :");
                        if(workResult<result) {
                        	result=workResult;
                        	startAnswer=startNum;
                        	endAnswer=endNum;
                        	leftAnswer=leftNum;
                        	rightAnswer=rightNum;
                        }
                    }
                }
            }
        }
       // 結果の出力
        System.out.println(Long.toString(result));
        //System.out.println("answer = " + result);
        //System.out.println("start = " + startAnswer);
        //System.out.println("end   = " + endAnswer);
        //System.out.println("left  = " + leftAnswer);
        //System.out.println("right = " + rightAnswer);
  }
}
