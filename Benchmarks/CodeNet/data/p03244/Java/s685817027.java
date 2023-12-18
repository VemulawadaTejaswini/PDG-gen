import java.util.Scanner;

class Main{

	static long ans = 0;
	static int N;
	static long M;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力

		int n = sc.nextInt();
		int[] v = new int[n];
		int[] odd= new int[n/2];
		int[] even= new int[n/2];


		int j = 0;
		for(int i=0;i < n;i++){
			if(i%2==1){
				odd[j] = sc.nextInt();
				j++;
			}else{
				even[j] = sc.nextInt();;
			}
		}


		boolean flag = false;				//全部一緒か見る


		for(int i=0;i < n/2-1;i++){
			if(odd[0] != even[0] || odd[i] != odd[i+1] || even[i] != even[i+1]){
				flag = true;
			}
		}
		if(!flag){
			System.out.println(odd.length);
			return;
		}
		j=0;


		//
		//		for(int i= 0;i < n/2;i++){
		//			System.out.println(odd[i]);
		//		}

		int[] odddata = new int[100001];
		for(int i = 0;i < n/2;i++){			//各数をカウント
			odddata[odd[i]]++;
		}
		int maxodd = 0;
		int firstodd = 0;
		int secondodd = odd[0];

		for(int i = 1;i < 100001;i++){			//最頻数の数値をえる
			if(maxodd<=odddata[i]){
				secondodd = firstodd;
				firstodd = i;
				maxodd = odddata[i];
			}
		}



		int[] evendata = new int[100001];
		for(int i = 0;i < n/2;i++){
			evendata[even[i]]++;
		}
		int maxeven= 0;
		int firsteven = 0;
		int secondeven = even[0];

		for(int i = 1;i < 100001;i++){
			if(maxeven<=evendata[i]){
				secondeven = firsteven;
				firsteven = i;
				maxeven = evendata[i];
			}
		}
		//	System.out.println("firsteven "+firsteven);

		if(firsteven !=firstodd){
			int ans =0 ;
			j = 0;
			for(int i= 0;i < n;i++){
				if(i%2==1){
					if(odd[j] != firstodd){
						ans++;
					}
					j++;
				}else{
					if(even[j] != firsteven){
						ans++;
					}

				}
			}
			System.out.println(ans);
			return;
		}


		j = 0;
		int count = 0;
		for(int i= 0;i < n;i++){
			if(i%2==1){
				if(odd[j] != firstodd){
					count++;
				}
				j++;
			}else{
				if(even[j] != secondeven){
					count++;
				}

			}
		}

		j = 0;
		int subcount = 0;
		for(int i= 0;i < n;i++){
			if(i%2==1){
				if(odd[j] != secondodd){
					subcount++;
				}
				j++;
			}else{
				if(even[j] != firsteven){
					subcount++;
				}

			}
		}

		System.out.println(Math.min(count, subcount)));








	}


}



