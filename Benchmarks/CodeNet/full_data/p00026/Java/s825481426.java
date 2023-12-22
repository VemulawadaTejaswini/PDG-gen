import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	public class Main {
		public static void main(String[] args) {
			String line;
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int [][]a=new int[10][10];
			int count=0,max=0;
			try {
				while((line=reader.readLine())!=null) {
					if(line.equals(""))break;
					String []st=line.split(",");
					int x=Integer.parseInt(st[0]);
					int y=Integer.parseInt(st[1]);
					int size=Integer.parseInt(st[2]);
					if(size>=1) {
						try {
							a[x][y]++;
							a[x-1][y]++;
							a[x+1][y]++;
							a[x][y-1]++;
							a[x][y+1]++;
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					if(size>=2) {
						a[x-1][y-1]++;
						a[x+1][y-1]++;
						a[x-1][y+1]++;
						a[x+1][y+1]++;
					}
					if(size==3) {
						try {
							a[x][y-2]++;
							a[x][y+2]++;
							a[x-2][y]++;
							a[x+2][y]++;
						} catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}
				}
			for(int i=0;i<10;i++){
					for(int j=0;j<10;j++){
						if (a[i][j]==0)
							count++;
						else{
							if(a[i][j]>max){
								max=a[i][j];
							}
						}
					}	
				}
				System.out.println(count);
				System.out.println(max);  
			} catch (IOException e) {
				e.printStackTrace();
			}				  			
		}
	}
