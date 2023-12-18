//.h file code:

public:
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
