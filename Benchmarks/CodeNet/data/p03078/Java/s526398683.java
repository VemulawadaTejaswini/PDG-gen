import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
		int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
		long [] in1 = new long [x];
        long [] in2 = new long [y];
        long [] in3 = new long [z];
        for(int i=0;i<x;i++){
                             in1[i] = sc.nextLong();
                            }
        for(int i=0;i<y;i++){
                             in2[i] = sc.nextLong();
                            }	
        for(int i=0;i<z;i++){
                             in3[i] = sc.nextLong();
                            }
        Arrays.sort(in1);
        Arrays.sort(in2);
        Arrays.sort(in3);
        int X = x-1;
        int Y = y-1;
        int Z = z-1;
        long dx,dy,dz;
        if(X>0){dx = in1[X]-in1[X-1];}
        else{dx=in1[x-1]+in2[y-1]+in3[z-1];}
        if(Y>0){dy = in2[Y]-in2[Y-1];}
        else{dy=in1[x-1]+in2[y-1]+in3[z-1];}
        if(Z>0){dz = in3[Z]-in3[Z-1];}
        else{dz=in1[x-1]+in2[y-1]+in3[z-1];}
	    for(int i=0;i<k;i++){System.out.println(in1[X]+in2[Y]+in3[Z]);
                            if(dx<=dy && dx<=dz){X=Math.max(0,X-1);
                                                 if(X>0){dx = in1[X]-in1[X-1];}
                                                 else{dx=in1[x-1]+in2[y-1]+in3[z-1];}
                                                }
                             else{if(dy<=dz){Y=Math.max(0,Y-1);
                                             if(Y>0){dy = in2[Y]-in2[Y-1];}
                                             else{dy=in1[x-1]+in2[y-1]+in3[z-1];}
                                            }
                                  else{Z=Math.max(0,Z-1);
                                       if(Z>0){dz = in3[Z]-in3[Z-1];}
                                       else{dz=in1[x-1]+in2[y-1]+in3[z-1];}
                                      }
                                 }
                            }
  }
}