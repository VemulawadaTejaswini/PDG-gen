#include<iostream>
#include<queue>
#include <math.h>
using namespace std;

double noudo(double w, double s){
    return s/(w+s);
}


int main(){
    int a,b,c,d,e,f;
    cin >> a >> b >> c >> d >> e >> f;

    int water=0, sugar=0;
    double ans = 0.0;
    double defaultNoudo = noudo(100, e);
    //cout << defaultNoudo << endl;

    int nw=0, ns=0;
    for(int i=0; i<=f/(100*a); i++){
        //cout << "a";
        for(int j=0; j<=f/(100*b); j++){
            //cout << "b";
            nw = 100*a*i+100*b*j;
            double max_sugar = e*(i*a+j*b);
            //cout << "(i,j)=" <<i<<" "<< j<<endl;
            //cout << "max_sugar = " << max_sugar << endl;
            for(int k=0; k*c<=max_sugar;k++){
                //cout << "c";
                for(int l=0;k*c+l*d<=max_sugar; l++){
                    //cout << "d";
                    ns = c*k+d*l;
                    double n = noudo((double)nw, (double)ns);
                    //cout << "(i,j,k,l)=" <<i<<" "<< j<<" "<<k<<" "<<l<<endl;
                    if((nw+ns <= f)&&(n<=defaultNoudo)){//総量＆＆濃度
                        //cout << "e";       
                        //cout << n << " "<< nw << " "<<ns <<endl;
                        if(ans < n){
                          //  cout << "f";
                            ans = n;
                            water = nw;
                            sugar = ns;
                        }
                        if(n==defaultNoudo){
                            i=3000;
                            j=3000;
                            k=3000;
                            l=3000;
                        }
                    }
                }
            }
        }
    }

    cout << water+sugar << " " <<  sugar << endl;
    return 0;
}