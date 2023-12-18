import java.util.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        long a = sc.nextLong();
		long b = sc.nextLong();
        long c = sc.nextLong();
        long d = a+b;
        long e = b+c;
        long f = c+a;
        String jud = "Yes";
        String [] que = new String [n];
        String [] ans = new String [n];
        for(int i=0;i<n;i++){que[i] = sc.next();
                             if(que[i].equals("AB")){d--;}
                             if(que[i].equals("BC")){e--;}
                             if(que[i].equals("AC")){f--;}
        } 
         for(int i=0;i<n;i++){
                             if(que[i].equals("AB")){if(a+b<=1){jud = "No";break;}
                                                    if(f>e){a--;f--;b++;e++;ans[i]="B";}
                                                    else{if(f<e){b--;e--;a++;f++;ans[i]="A";}
                                                        else{if(a>b){a--;f--;b++;e++;ans[i]="B";}
                                                            else{b--;e--;a++;f++;ans[i]="A";}}}
                                                    }
                             if(que[i].equals("BC")){if(b+c<=1){jud = "No";break;}
                                                     if(f>d){c--;f--;b++;d++;ans[i]="B";}
                                                    else{if(f<d){b--;d--;c++;f++;ans[i]="C";}
                                                        else{if(b>c){c++;f++;b--;d--;ans[i]="C";}
                                                            else{b++;e++;c--;f--;ans[i]="B";}}}
                                                    }
                             if(que[i].equals("AC")){if(c+a<=1){jud = "No";break;}
                                                     if(d>e){a--;d--;c++;e++;ans[i]="C";}
                                                    else{if(d<e){c--;e--;a++;d++;ans[i]="A";}
                                                        else{if(c>a){a++;d++;c--;e--;ans[i]="A";}
                                                            else{a--;d--;c++;e++;ans[i]="C";}}}
                                                    }
                             }
		System.out.println(jud);
           if(jud.equals("Yes")){for(int i=0;i<n;i++){System.out.println(ans[i]);}
                               }
	}
}
