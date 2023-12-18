//.h file code:

#include<bits/stdc++.h> #define rep(i,a,b) for(int i=a;i<b;i++) #define rrep(i,a,b) for(int i=a;i>=b;i--) #define fore(i,a) for(@auto &i:a) #define all(x)(x).begin(),(x).end() #pragma GCC optimize("-O3") @using @namespace std;
void _main();
public:
virtual int main();
typedef_Renamed *long long;
const *int;
const *ll;
virtual template_Renamed<class T> bool_Renamed *chmax(T &a, const *T);
virtual template_Renamed<class T> bool_Renamed *chmin(T &a, const *T);

//.cpp file code:

int <missing_class_definition>::main()
{
	cin::tie(0);
	ios::sync_with_stdio(false);
	_main();
}

template_Renamed<class T> bool_Renamed *<missing_class_definition>::chmax(T &a, const *T)
{
	if (a < b)
	{
		a = b;
		return 1;
	}
	return 0;
}

template_Renamed<class T> bool_Renamed *<missing_class_definition>::chmin(T &a, const *T)
{
	if (b < a)
	{
		a = b;
		return 1;
	}
	return 0;
}
//.h file code:

public:
ll *A, *B, *C, *X, *Y;
//---------------------------------------------------------------------------------------------------
virtual void _main();

//.cpp file code:

void <missing_class_definition>::_main()
{
	cin >> A >> B >> C >> X >> Y;

	ll *ans = infl;
	rep(ab, 0, 201010)
	{
		ll *sm = C * ab;

		ll *x = X - ab / 2;
		ll *y = Y - ab / 2;

		if (0 < x)
		{
			sm += x * A;
		}
		if (0 < y)
		{
			sm += y * B;
		}

		chmin(ans, sm);
	}

	cout << ans << endl;
}
