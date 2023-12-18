my @e = split(/\s/, <STDIN>);
chomp(my $k = <STDIN>);

my $sum = 0, $max = 0;
for (@e) {
    $sum += $_;
    $max = $_ if $max < $_;
}
print $sum - $max + $max * (1<<$k), "\n";
