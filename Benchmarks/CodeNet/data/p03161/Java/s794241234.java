#include <iostream>
#include <math.h>

using namespace std;

int menorCusto = 2000000000;
int dMax = 0;

void geraComb(int posAtual, int qtdCand, int passoMax, int *n, bool vBool[], int v[], int *dMax);
void verifSolucao(bool vBool[], int v[], int k, int *n);


int main(){
	int num;
	int n;
	int k;
	int high;
	
	//cin >> n >> k;
	scanf("%d",&n);
	scanf("%d",&k);
	
	int v[n];
	//vector <int> v;
	bool vBool[n];
	
	for(int i = 0; i < n; i++){
		//cin >> v[i];
		scanf("%d",&v[i]);
		//cin >> num;
		//v.push_back(num);
		vBool[i] = false;
	}
	
	geraComb(0, n, k, &n, vBool, v, &dMax);
	
	//cout << menorCusto << endl;
	printf("%d", menorCusto);
}

void geraComb(int posAtual, int qtdCand, int passoMax, int *n, bool vBool[], int v[], int *dM){
	//cout << *dMax << endl;
	if(*dM >= passoMax){
		//*dM -= 1;
		return;	
	}
	if(posAtual == *n /*- 1*/ && vBool[0] && vBool[*n - 1]) verifSolucao(vBool, v, passoMax, n);
	else{
		for(int i = 0; i < *n; i++){
			int aux = 0;
			if(posAtual + i + 1 <= *n){
				//cout << "\nposAtual + 1 = " << posAtual + 1 << " qtdCand - 1 = " << qtdCand - 1 << " passoMax = " << passoMax << " n = " << *n;
				vBool[posAtual /*+ i*/] = true;
				aux = *dM;
				*dM = 0; //cout << "T" << *dM << endl;
				geraComb(posAtual + 1, qtdCand - 1, passoMax, n, vBool, v, dM);
				if(vBool[posAtual]) *dM = aux;
				if(!vBool[0] || posAtual == (*n - 1)) return;
				vBool[posAtual /*+ i*/] = false;
				*dM += 1; //cout << "F" << *dM << endl;
				geraComb(posAtual + 1, qtdCand - 1, passoMax, n, vBool, v, dM);
				//if(*dM > 0) *dM -= 1;
				/*if(!vBool[0]) */return;
			}
		}
	}
	return;
}

void verifSolucao(bool vBool[], int v[], int k, int *n){
	int pedraAnt = 0;
	int custo = 0;
	
	/*for(int i = 0; i < *n; i++)
		cout << vBool[i];*/

	for(int i = 0; i < *n; i++){
		if (vBool[i] && vBool[*n - 1] && i > 0){
			custo += fabs(v[i] - v[pedraAnt]);
			//cout << "\npedraAnt = "<< pedraAnt << " pedraAtual = " << i << " custo += (v[i] - v[pedraAnt]) = " << custo - fabs(v[i] - v[pedraAnt]) << " += fabs(" << v[i] << " - " << v[pedraAnt] << ")";
			pedraAnt = i;
		}
	}
	
	if(custo < menorCusto) menorCusto = custo;
	
		//cout << menorCusto << endl;
	//}
	
	return;
}