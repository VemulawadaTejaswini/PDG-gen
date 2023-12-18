import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int C=stdIn.nextInt();
		int D=stdIn.nextInt();
		char a[]=new char[N];
		char b[]=new char[N];
		boolean key=false;
		int z=0,fin=0,y=0;
		while(z<N){
			a[z]=(char)System.in.read();
			if(z==A-1)
				a[z]='#';
			if(z==B-1)
				a[z]='#';
			b[z]=a[z];
			if(z==B){
				key=true;
				a[z-1]='.';
			}
			if(key){
				if(a[z]=='#')
					fin++;
				else
					fin=0;
				if(fin==2)
					break;
				if(z==D-1){
					a[z]='#';
					break;
				}
			}
			z++;
		}z=0;
		if(fin!=2){
			key=false;fin=0;
			while(z<N){
				if(z==A){
					key=true;
					a[z-1]='.';
				}
				if(key){
					if(a[z]=='#')
						fin++;
					else
						fin=0;
					if(fin==2)
						break;
					if(z==C-1){
						a[z]='#';
						break;
					}
				}
				z++;
			}z=0;
		}
		if(fin==2){
			key=false;fin=0;
			while(z<N){
				if(z==B-1){
					key=true;
					b[z]='.';
				}
				if(key){
					if(b[z]=='.')
						fin++;
					else
						fin=0;
					if(fin==3){
						if(z-1==C)
							fin--;
						else{
							b[z-1]='#';
							y=z;
							break;
						}
					}
					if(z==D-1){
						b[z]='#';
						y=z;
						break;
					}
				}
				z++;
			}z=0;
			fin=0;key=false;
			while(z<N){
				if(z==A){
					key=true;
					b[z-1]='.';
				}
				if(key){
					if(b[z]=='#')
						fin++;
					else
						fin=0;
					if(fin==2)
						break;
					if(z==C-1){
						b[z]='#';
						break;
					}
				}
				z++;
			}z=0;
			if(fin!=2){
				fin=0;key=true;z=y+1;
				while(z<N){
					if(key){
						if(b[z]=='#')
							fin++;
						else
							fin=0;
						if(fin==2)
							break;
						if(z==D-1){
							b[z]='#';
							break;
						}
					}
					z++;
				}z=0;
			}
		}
		if(fin==2)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}