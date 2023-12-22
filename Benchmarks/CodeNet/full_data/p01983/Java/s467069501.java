import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		while(true) {
			String a=sc.next();
			if(a.equals(".")) {
				System.exit(0);
			}
			int wa=sc.nextInt();
			int[] que=new int[100];
			int[] suuji=new int[4];
			int kosu=0;


			suuji[0]=wa/1000;
			suuji[1]=(wa%1000)/100;
			suuji[2]=(wa%100)/10;
			suuji[3]=wa%10;
			for(int i=0; i<a.length(); i++) {
				char k=a.charAt(a.length()-i-1);
				if(k=='[' || k==']') {
					//ignore
				}

				else if(k=='a') {
					que[kosu]=suuji[0];
					kosu++;
				}

				else if(k=='b') {
					que[kosu]=suuji[1];
					kosu++;
				}

				else if(k=='c') {
					que[kosu]=suuji[2];
					kosu++;
				}

				else if(k=='d') {
					que[kosu]=suuji[3];
					kosu++;
				}

				else {
					if(k=='+') {
						int p=que[kosu-1]|que[kosu-2];
						que[kosu-1]=0;
						que[kosu-2]=p;
						kosu--;

					}

					else if(k=='*') {
						int p=que[kosu-1]&que[kosu-2];
						que[kosu-1]=0;
						que[kosu-2]=p;
						kosu--;
					}

					else if(k=='^') {
						int p=que[kosu-1]^que[kosu-2];
						que[kosu-1]=0;
						que[kosu-2]=p;
						kosu--;
					}
				}
			}

			int ans=que[0];
			int ss=0;

			for(int l=0; l<=9999; l++) {
				suuji[0]=l/1000;
				suuji[1]=(l%1000)/100;
				suuji[2]=(l%100)/10;
				suuji[3]=l%10;
				kosu=0;
				for(int i=0; i<a.length(); i++) {
					char k=a.charAt(a.length()-i-1);
					if(k=='[' || k==']') {
						//ignore
					}

					else if(k=='a') {
						que[kosu]=suuji[0];
						kosu++;
					}

					else if(k=='b') {
						que[kosu]=suuji[1];
						kosu++;
					}

					else if(k=='c') {
						que[kosu]=suuji[2];
						kosu++;
					}

					else if(k=='d') {
						que[kosu]=suuji[3];
						kosu++;
					}

					else {
						if(k=='+') {
							int p=que[kosu-1]|que[kosu-2];
							que[kosu-1]=0;
							que[kosu-2]=p;
							kosu--;

						}

						else if(k=='*') {
							int p=que[kosu-1]&que[kosu-2];
							que[kosu-1]=0;
							que[kosu-2]=p;
							kosu--;
						}

						else if(k=='^') {
							int p=que[kosu-1]^que[kosu-2];
							que[kosu-1]=0;
							que[kosu-2]=p;
							kosu--;
						}
					}
				}
				if(ans==que[0]) {
					ss++;
				}
			}
			System.out.println(ans+" "+ss);
		}
	}
}
