import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        ArrayList<Point> li = new ArrayList<Point>();
        for(int i = 0; i < q; i++){
            li.add(new Point(sc.nextInt()-1,sc.nextInt()-1,sc.nextInt(),sc.nextInt()));
        }
        long ans = 0;
        int[] arr = new int[10];
        for(int i1 = 1; i1 <= m; i1++){
            for(int i2 = i1; i2 <= m; i2++){
                for(int i3 = i2; i3 <= m; i3++){
                    for(int i4 = i3; i4 <= m; i4++){
                        for(int i5 = i4; i5 <= m; i5++){
                            for(int i6 = i5; i6 <= m; i6++){
                                for(int i7 = i6; i7 <= m; i7++){
                                    for(int i8 = i7; i8 <= m; i8++){
                                        for(int i9 = i8; i9 <= m; i9++){
                                            long tmp = 0;
                                            arr[0] = i1;
                                            arr[1] = i2;
                                            arr[2] = i3;
                                            arr[3] = i4;
                                            arr[4] = i5;
                                            arr[5] = i6;
                                            arr[6] = i7;
                                            arr[7] = i8;
                                            arr[8] = i9;
                                            arr[9] = m;
                                            for(Point p : li){
                                                if(arr[p.b]-arr[p.a] == p.c){
                                                    tmp += p.d;
                                                }
                                            }
                                            ans = Math.max(ans,tmp);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } 
        }
        System.out.println(ans);
    }
}

class Point{
    int a,b,c,d;
    public Point(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
