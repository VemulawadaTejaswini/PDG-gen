import java.io.*;

class Point {
    public double x, y;
    Point( double x, double y )
    {
        this.x = x;
        this.y = y;
    }
    public static void move( Point move, double mx, double my, double si, double co )
    {
        double[][] xy = { {move.x},
                            {move.y},
                            {1} };
        double[][] r = { { co, -si, 0 },
                        { si, co, 0 },
                        { 0, 0, 1 } };
        double[][] m = { { 1, 0, mx },
                        { 0, 1, my },
                        { 0, 0, 1 } };    
        int i,j,k;
        double[][] a = new double[3][3];
        for( i=0; i<3; i++ ) {
            for( j=0; j<3; j++ ) {
                for( k=0; k<3; k++ ) {
                    a[i][j] += m[i][k]*r[k][j];
                }
            }
        }
        double[][] b = new double[3][1];
        for( i=0; i<3; i++ ) {
            for( j=0; j<3; j++ ) {
                b[i][0] += a[i][j]*xy[j][0];
            }
        }
    
        move.x = b[0][0];
        move.y = b[1][0];
        return;
    }    
}
  
class Main {
    public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
            int n = Integer.parseInt( kb.readLine() );

            System.out.println( 0.0+" "+100.0 );
            if( 1 <= n ) {
                kochCurve( n, 0, 0, 100.0, 0.0 );
            }
            System.out.println( 100.0+" "+0.0 );
              
            kb.close();
        } catch( IOException e ) {
            System.err.println( e );
        }
    }
 
    public static void kochCurve( int n, double px, double py, double px2, double py2 )
    {
        double d = Math.sqrt( Math.pow( px2-px, 2 ) + Math.pow( py2-py, 2 ) );
        double sx = d/3;
        Point s = new Point( sx, 0 );
        Point u = new Point( d/2, Math.sin( Math.toRadians(60) )*sx );
        Point t = new Point( sx*2, 0 );

        
        double si = 0;
        double co = 0;
        py = py*100000;
        py = (double)(int)py;
        py = py/100000;
        py2 = py2*100000;
        py2 = (double)(int)py2;
        py2 = py2/100000;
        if( px < px2 ) {
            if( py == py2 ) {
                si = 0;
                co = 0;            
            } else if( py < py2 ) {
                si = 60;
                co = 60;         
            } else if( py2 < py ) {
                si = -60;
                co = -60;
            }
        } else if( px2 < px ) {
            if( py == py2 ) {
                si = -180;
                co = -180;                 
            } else if( py2 < py ) {
                si = -120;
                co = -120;
            } else if( py < py2 ) {
                si = -240;
                co = -240;            
            }
        }
        si = Math.sin( Math.toRadians(si) );
        co = Math.cos( Math.toRadians(co) );
            
        Point.move( s, px, py, si, co );
        if( 1 < n ) {
            kochCurve( n-1, px, py, s.x, s.y );
        }
        System.out.println( s.x+" "+s.y );
        
        Point.move( u, px, py, si, co );
        if( 1 < n ) {
            kochCurve( n-1, s.x, s.y, u.x, u.y );
        }
        System.out.println( u.x+" "+u.y );
        
        Point.move( t, px, py, si, co );
        if( 1 < n ) {
            kochCurve( n-1, u.x, u.y, t.x, t.y );
        }
        System.out.println( t.x+" "+t.y );
        
        if( 1 < n ) {
            kochCurve( n-1, t.x, t.y, px2, py2 );
        }
    
        return;
    }
}