import java.io.BufferedReader;
			import java.io.FileReader;
			import java.io.IOException;
			import java.io.InputStreamReader;
			import java.io.PrintWriter;
			import java.math.BigInteger;
			import java.util.*;
			 
			 class Main{
					    void pre() throws Exception{}
					    int dp[],a[];
					    void solve(int TC) throws Exception{  
					 
					    	int n=ni();
					    	int k=ni();
					    	dp=new int[n];
					    	a=new int[Math.max(2,n)];
					   int cost=0;
					   for(int i=0;i<n;i++) 
							   dp[i]=-1;
					   
					   for(int i=0;i<n;i++) {
						   a[i]=ni();
					   						}
					   getMin(0, k , n);
					   pn(dp[0]);
					    }
					    int getMin(int i , int k , int n) {
					    	if(i>n)return Integer.MAX_VALUE;
					    	if(i==n-1)return 0;
					    	if(dp[i]!=-1)return dp[i];
					    	
					    	int min=Integer.MAX_VALUE;
					    	dp[i]=min;
					    	for(int j=i+1; j <= i+k&&(j<n) ; j ++) {
					    		min=Math.min(min, getMin(j , k , n) + Math.abs(a[i]-a[j]));
					    	}
					    		dp[i]=min;
					    		return min;
					    	}	 
					    
					    
							
					     
					   
	
			
	
					     
					    static boolean multipleTC = false, memory = false;
					    FastReader in;PrintWriter out;
					    void run() throws Exception{
					        in = new FastReader();
					        out = new PrintWriter(System.out);
					        int T = (multipleTC)?ni():1;
					        pre();for(int t = 1; t<= T; t++)solve(t);
					        out.flush();
					        out.close();
					    }
					    public static void main(String[] args) throws Exception{
					        if(memory)new Thread(null, new Runnable() {public void run(){try{new Main().run();}catch(Exception e){e.printStackTrace();}}}, "1", 1 << 28).start();
					        else new Main().run();
					    }
					    void p(Object o){out.print(o);}
					    void pn(Object o){out.println(o);}
					    void nd(Object o){out.println(o);}
					    void pni(Object o){out.println(o);out.flush();}
					    String n()throws Exception{return in.next();}
					    String nln()throws Exception{return in.nextLine();}
					    int ni()throws Exception{return Integer.parseInt(in.next());}
					    long nl()throws Exception{return Long.parseLong(in.next());}
					    double nd()throws Exception{return Double.parseDouble(in.next());}
					    
					    class FastReader{
					        BufferedReader br;
					        StringTokenizer st;
					        public FastReader(){
					            br = new BufferedReader(new InputStreamReader(System.in));
					        }
					
					        public FastReader(String s) throws Exception{
					            br = new BufferedReader(new FileReader(s));
					        }
					
					        String next() throws Exception{
					            while (st == null || !st.hasMoreElements()){
					                try{
					                    st = new StringTokenizer(br.readLine());
					                }catch (IOException  e){
					                    throw new Exception(e.toString());
					                }
					            }
					            return st.nextToken();
					        }
					
					        String nextLine() throws Exception{
					            String str = "";
					            try{   
						                str = br.readLine();
						            }catch (IOException e){
					                throw new Exception(e.toString());
					            }  
					            return str;
					        }
					    }
			}