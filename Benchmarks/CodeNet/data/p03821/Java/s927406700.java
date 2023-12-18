use v5.18; # strict say state
use warnings;
use List::Util qw(reduce first max min sum0);

chomp (my $n = <STDIN>);
my (@a, @b);
for my $i (0..$n-1) {
  chomp (($a[$i], $b[$i]) = split / /, <STDIN>);
}
my $ans = 0;
for my $i (0..($n-1)) {
  $ans += ($b[$n-$i-1] - ($a[$n-$i-1]+$ans) % $b[$n-$i-1]) % $b[$n-$i-1];
}
say $ans;