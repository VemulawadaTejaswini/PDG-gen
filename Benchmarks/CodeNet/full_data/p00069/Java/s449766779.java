import java.util.*;

class Main {
	//正規ルートを保存
	Scanner sc = new Scanner(System.in);
	public void run() {
		dataset:while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)break;
			int m=sc.nextInt()-1,g=sc.nextInt()-1,d=sc.nextInt();
			char[][] map=new char[d][n-1];
			for(int i=0;i<d;i++){
				map[i]=sc.next().toCharArray();
			}
			int[] root=new int[d+1];
			root[d]=g;
			for(int i=d-1;i>=0;i--){
				if(root[i+1]-1>=0 &&  map[i][root[i+1]-1]=='1'){
					root[i]=root[i+1]-1;
				}else if(n-1>root[i+1] && map[i][root[i+1]]=='1'){
					root[i]=root[i+1]+1;
				}else{
					root[i]=root[i+1];
				}
			}

			int pos=m;
			if(pos==root[0]){
				ln(0);
				continue dataset;
			}

			for(int i=0;i<d;i++){
				if(pos-1>=0 &&  map[i][pos-1]=='1'){
					pos--;
				}else if(n-1>pos && map[i][pos]=='1'){
					pos++;
				}else{
					if(root[i]==pos+1 && (!(pos+1<n-1) || map[i][pos+1]=='0')){
						ln((i+1) +" "+(pos+1));
						continue dataset;
					}else if(root[i]==pos-1 && (!(pos-2>=0)|| map[i][pos-2]=='0')){
						ln((i+1) +" "+(pos-1));
						continue dataset;
					}
				}
			}
			ln(1);
			continue dataset;
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
	public static void pr(Object o) {
		System.out.print(o);
	}
	public static void ln(Object o) {
		System.out.println(o);
	}
	public static void ln() {
		System.out.println();
	}
}