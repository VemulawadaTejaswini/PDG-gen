
public class Main {
 
        private void run() {
                Scanner sc = new Scanner(System.in);
                
                                
                for(;;) {
                        long n = sc.nextLong();
                        int k = sc.nextInt();
                        if(n+k==0)
                                break;
                        int sum = 0;
                        int d=1;
                        long num = 1;
                        long cnt = 1;
                        
                        long g2 = 0;
                        {
                            long n2 = n;
                            long dig = 10;
                        	
                            for(int i = 1; ;i++){
               //            	System.out.println(dig*i +" "+n2+ " " + i);
                            	if(n2 < dig*i){
                            		num = n2 / i ;
                            		g2 =  (n2)%i;
                            	
                            		break;
                            	}
                            	n2+=dig;
                            	dig *= 10;
                            }
                        }
                        long nums = num;
                        long gs = g2;

                        {
                            long n2 = n+k;
                            long dig = 10;
                        	
                            for(int i = 1; ;i++){
               //            	System.out.println(dig*i +" "+n2+ " " + i);
                            	if(n2 < dig*i){
                            		num = n2 / i ;
                            		g2 =  (n2)%i;
                            	
                            		break;
                            	}
                            	n2+=dig;
                            	dig *= 10;
                            }
                        }

                        System.out.print((nums+"").substring((int)gs));
                        for(int i = (int)nums+1 ; i < num; i++){
                        	System.out.print(i);
                        }
                        System.out.print((""+num).substring(0,(int)g2));
                       System.out.println();
                }
                sc.close();
        }
 
        public static void main(String args[]) {
                new Main().run();
        }
}