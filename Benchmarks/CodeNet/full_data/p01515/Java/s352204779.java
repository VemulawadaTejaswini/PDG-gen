import java.util.Scanner;

public class Main {
	char[] s1;//原文1
	char[] s2;//原文2
	int index;//今なん文字目か
	int[] table;//PQRの値
	public static void main(String[] args) {
		new Main().run();
	}
	void run(){
		Scanner sc=new Scanner(System.in);
		while(true){
			String str[]=sc.nextLine().split("=");
			if(str[0].equals("#")) break;
			//なぜこの番兵みたいな$を先輩はつけたのか？
			//必要性を考えたい。これがないとダメな場合がある？
			//s=(str+"$").toCharArray();
			s1=str[0].toCharArray();
			s2=str[1].toCharArray();
			table=new int[11];
			//int ans=0;
			boolean flag=true;
			equation :
				for(int a=0; a<2; a++){
					table[0]=a;
					for(int b=0; b<2; b++){
						table[1]=b;
						for(int c=0; c<2; c++){
							table[2]=c;
							for(int d=0; d<2; d++){
								table[3]=d;
								for(int e=0; e<2; e++){
									table[4]=e;
									for(int f=0; f<2; f++){
										table[5]=f;
										for(int g=0; g<2; g++){
											table[6]=g;
											for(int h=0; h<2; h++){
												table[7]=h;
												for(int i=0; i<2; i++){
													table[8]=i;
													for(int j=0; j<2; j++){
														table[9]=j;
														for(int k=0; k<2; k++){
															table[10]=k;
															index=0;
															int ans1=formura(s1);
															index=0;
															int ans2=formura(s2);
															if(ans1 != ans2){
																//not equation
																flag=false;
																break equation;
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			if(flag) System.out.println("YES");
			else System.out.println("NO");
		}
	}
	int formura(char s[]){
		char c=c(s);
		
		if(c=='('){
			int a = formura(s);
			char c2 = c(s);
			if(c2 == '*'){
				int b = formura(s);
				c(s);
				return Math.min(a, b);
			}
			else if(c2 == '+'){
				int b = formura(s);
				c(s);
				return Math.max(a, b);
			}
			else{
				c(s);
				int b = formura(s);
				c(s);
				if(a==1 && b==0){
					return 0;
				}
				return 1;
			}
		}
		else if(c=='-'){
			int r=formura(s);
			if(r==0){
				return 1;
			}
			else if(r==1){
				return 0;
			}
		}
		else if(c=='T'){
			return 1;
		}
		else if(c=='F'){
			return 0;
		}
		else{
			return table[c-'a'];
		}
		
		return -1;
	}

	char c(char s[]){
		return s[index++];
	}
}